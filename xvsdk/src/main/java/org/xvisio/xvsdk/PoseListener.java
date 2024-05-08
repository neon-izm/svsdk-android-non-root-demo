package org.xvisio.xvsdk;

public interface PoseListener {
    void onPose(double x, double y, double z, double quatX, double quatY, double quatZ, double quatW, double confidence);
}
