package com.platform;

public class Navigator {
    // КОМПОЗИЦИЯ: контекст содержит ссылку на стратегию, а не наследует её
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    // Метод для динамической смены стратегии на лету
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    // Делегирование выполнения алгоритма без if/switch (OCP)
    public void createRoute(String startPoint, String endPoint) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy is not set!");
        }
        strategy.buildRoute(startPoint, endPoint);
    }
}