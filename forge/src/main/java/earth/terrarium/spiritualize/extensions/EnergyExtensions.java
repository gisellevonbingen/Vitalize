package earth.terrarium.spiritualize.extensions;

import earth.terrarium.spiritualize.api.AbstractEnergy;
import earth.terrarium.spiritualize.util.extensions.ExtensionFor;
import net.minecraftforge.energy.IEnergyStorage;

@ExtensionFor(AbstractEnergy.class)
public interface EnergyExtensions extends IEnergyStorage {
    default int receiveEnergy(int maxAmount, boolean bl) {
        return (int) ((AbstractEnergy) this).insertEnergy(maxAmount);
    }

    default int extractEnergy(int maxAmount, boolean bl) {
        return (int) ((AbstractEnergy) this).extractEnergy(maxAmount);
    }

    default int getEnergyStored() {
        return (int) ((AbstractEnergy) this).getEnergyLevel();
    }

    default int getMaxEnergyStored() {
        return (int) ((AbstractEnergy) this).getMaxCapacity();
    }

    default boolean canExtract() {
        return false;
    }

    default boolean canReceive() {
        return true;
    }
}
