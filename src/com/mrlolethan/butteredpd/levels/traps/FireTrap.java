/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015  Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2015 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.mrlolethan.butteredpd.levels.traps;

import com.mrlolethan.butteredpd.actors.blobs.Blob;
import com.mrlolethan.butteredpd.actors.blobs.Fire;
import com.mrlolethan.butteredpd.effects.CellEmitter;
import com.mrlolethan.butteredpd.effects.particles.FlameParticle;
import com.mrlolethan.butteredpd.scenes.GameScene;

public class FireTrap extends Trap {

	// 0xFF7708
	{
		name = "Fire trap";
		image = 1;
	}

	@Override
	public void activate() {

		GameScene.add( Blob.seed( pos, 2, Fire.class ) );
		CellEmitter.get( pos ).burst( FlameParticle.FACTORY, 5 );

	}
}
