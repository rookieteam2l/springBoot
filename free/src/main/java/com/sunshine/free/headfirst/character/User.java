package com.sunshine.free.headfirst.character;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class User {

    public static void main(String[] args) {
        Character knight = new Knight();
        knight.setWeapon(new SwordBehavior());
        knight.weapon.useWeapon();

    }
}
