package net.toasterworks.shiveringwoods.api.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.toasterworks.shiveringwoods.api.block.utils.HollowBlockType;
import net.toasterworks.shiveringwoods.api.block.utils.WoodsBlockProperties;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HollowBlock extends BaseEntityBlock {
    public static DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static EnumProperty<HollowBlockType> BLOCK_TYPE = WoodsBlockProperties.HOLLOW_BLOCK_TYPE;

    public HollowBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(
                this.getStateDefinition().any()
                        .setValue(FACING, Direction.NORTH)
                        .setValue(BLOCK_TYPE, HollowBlockType.UNTOUCHED)
        );
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_) {
        return null;
    }

    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult result) {
        if (level.isClientSide()) { return InteractionResult.SUCCESS; }

        //TODO: configured chance percentage; rewrite this nonsense
        if (blockState.getValue(BLOCK_TYPE) == HollowBlockType.UNTOUCHED) {
            int rand = new Random().ints(0,7).findFirst().getAsInt();

            switch (rand) {
                case 0:
                    setHostile(level, blockPos, blockState);
                    break;
                case 1:
                case 2:
                    setMerchant(level, blockPos, blockState);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    setEmpty(level, blockPos, blockState);
                    break;
            }
        }

        return InteractionResult.CONSUME;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, BLOCK_TYPE);
    }

    public RenderShape getRenderShape(BlockState p_49232_) {
        return RenderShape.MODEL;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    private static void setMerchant(Level level, BlockPos blockPos, BlockState state) {
        level.setBlockAndUpdate(blockPos, state.setValue(BLOCK_TYPE, HollowBlockType.MERCHANT));
    }

    private static void setEmpty(Level level, BlockPos blockPos, BlockState state) {
        level.setBlockAndUpdate(blockPos, state.setValue(BLOCK_TYPE, HollowBlockType.EMPTY));
    }

    private static void setHostile(Level level, BlockPos blockPos, BlockState state) {
        level.setBlockAndUpdate(blockPos, state.setValue(BLOCK_TYPE, HollowBlockType.HOSTILE));
    }
}
