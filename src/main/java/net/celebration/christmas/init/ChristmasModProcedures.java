
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.celebration.christmas.init;

import net.celebration.christmas.procedures.TreeAdditionalGenerationConditionProcedure;
import net.celebration.christmas.procedures.SantaTotemActivateProcedure;
import net.celebration.christmas.procedures.GrantTotemAdvProcedure;
import net.celebration.christmas.procedures.GrantRecipesProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ChristmasModProcedures {
	public static void load() {
		new SantaTotemActivateProcedure();
		new GrantRecipesProcedure();
		new TreeAdditionalGenerationConditionProcedure();
		new GrantTotemAdvProcedure();
	}
}
