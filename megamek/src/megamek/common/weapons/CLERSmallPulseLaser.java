/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 12, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 */
public class CLERSmallPulseLaser extends PulseLaserWeapon {
    /**
     *
     */
    private static final long serialVersionUID = -273231806790327505L;

    /**
     *
     */
    public CLERSmallPulseLaser() {
        super();
        techLevel = TechConstants.T_CLAN_EXPERIMENTAL;
        name = "ER Small Pulse Laser";
        setInternalName("CLERSmallPulseLaser");
        addLookupName("Clan ER Pulse Small Laser");
        addLookupName("Clan ER Small Pulse Laser");
        heat = 3;
        damage = 5;
        toHitModifier = -1;
        shortRange = 2;
        mediumRange = 4;
        longRange = 6;
        extremeRange = 8;
        waterShortRange = 1;
        waterMediumRange = 2;
        waterLongRange = 4;
        waterExtremeRange = 4;
        tonnage = 1.5f;
        criticals = 1;
        bv = 36;
        cost = 30000;
    }
}