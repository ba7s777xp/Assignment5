package com.platform;

public class Main {
    public static void main(String[] args) {
        // Создаем контекст с автомобильной стратегией
        Navigator navigator = new Navigator(new CarRouteStrategy());
        navigator.createRoute("Astana IT University", "Baiterek Tower");

        // Меняем стратегию на пешеходную на лету
        navigator.setStrategy(new WalkingRouteStrategy());
        navigator.createRoute("Astana IT University", "Expo Boulevard");

        // Меняем стратегию на велосипедную
        navigator.setStrategy(new BicyclingRouteStrategy());
        navigator.createRoute("Astana IT University", "Hazret Sultan Mosque");
    }
}