package com.platform;

public class CarRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating fastest car route from " + startPoint + " to " + endPoint + " (via highways).");
    }
}