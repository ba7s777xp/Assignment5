package com.platform;

public class WalkingRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating shortest walking route from " + startPoint + " to " + endPoint + " (via pedestrian zones).");
    }
}