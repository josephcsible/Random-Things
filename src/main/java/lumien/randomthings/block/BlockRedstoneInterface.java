package lumien.randomthings.block;

import lumien.randomthings.tileentity.redstoneinterface.TileEntityRedstoneInterface;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockRedstoneInterface extends BlockContainerBase
{
	protected BlockRedstoneInterface(String name, Material materialIn)
	{
		super(name, materialIn);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
	{
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	{
		((TileEntityRedstoneInterface) worldIn.getTileEntity(pos)).broken();
		super.breakBlock(worldIn, pos, state);
	}
}
