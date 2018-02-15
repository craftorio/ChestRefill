package io.github.aquerr.chestrefill.managers;

import io.github.aquerr.chestrefill.entities.ChestLocation;
import io.github.aquerr.chestrefill.entities.RefillingChest;
import io.github.aquerr.chestrefill.storage.JSONChestStorage;
import org.spongepowered.api.block.tileentity.carrier.Chest;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Aquerr on 2018-02-13.
 */
public class ChestManager
{
    //TODO: Add here code for choosing and selecting storage mode.
    //TODO: Add setup method and instance of JSONChestStorage here.

    public static boolean addChest(RefillingChest refillingChest)
    {
        return JSONChestStorage.addChest(refillingChest);
    }

    public static List<RefillingChest> getChests()
    {
        return JSONChestStorage.getChests();
    }

    public static boolean removeChest(RefillingChest refillingChest)
    {
        return JSONChestStorage.removeChest(refillingChest);
    }
}
