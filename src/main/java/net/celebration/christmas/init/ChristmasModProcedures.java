
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.celebration.christmas.init;

import net.celebration.christmas.procedures.SantaTotemRightclickedProcedure;
import net.celebration.christmas.procedures.SantaTotemEntitySwingsItemProcedure;
import net.celebration.christmas.procedures.GrantRecipesProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ChristmasModProcedures {
	public static void load() {
		new GrantRecipesProcedure();
		new SantaTotemRightclickedProcedure();
		new SantaTotemEntitySwingsItemProcedure();
	}
}
