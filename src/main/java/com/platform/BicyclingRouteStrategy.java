package com.platform;

public class BicyclingRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating bicycle route from " + startPoint + " to " + endPoint + " (via bike lanes).");
    }
}