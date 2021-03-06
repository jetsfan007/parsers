package org.gbif.common.parsers.geospatial;

/**
 * A bounding box for lat long.
 */
public class LatLngBoundingBox {

  public static final LatLngBoundingBox GLOBAL_BOUNDING_BOX = new LatLngBoundingBox(-180, -90, 180, 90);

  double minLong;
  double minLat;
  double maxLong;
  double maxLat;

  /**
   * Force the box to be well formed
   */
  public LatLngBoundingBox(double minLong, double minLat, double maxLong, double maxLat) {
    this.minLong = minLong;
    this.minLat = minLat;
    this.maxLong = maxLong;
    this.maxLat = maxLat;
  }

  @Override
  public boolean equals(Object t) {
    if (t instanceof LatLngBoundingBox) {
      LatLngBoundingBox target = (LatLngBoundingBox) t;
      if (minLat == target.getMinLat() && minLong == target.getMinLong() && maxLat == target.getMaxLat()
          && maxLong == target.getMaxLong()) {
        return true;
      }
    }
    return super.equals(t);
  }

  @Override
  public String toString() {
    return "minLong[" + minLong + "] minLat[" + minLat + "] maxLong[" + maxLong + "] maxLat[" + maxLat + "] ";
  }

  /**
   * @return the maxLat
   */
  public double getMaxLat() {
    return maxLat;
  }

  /**
   * @param maxLat the maxLat to set
   */
  public void setMaxLat(double maxLat) {
    this.maxLat = maxLat;
  }

  /**
   * @return the maxLong
   */
  public double getMaxLong() {
    return maxLong;
  }

  /**
   * @param maxLong the maxLong to set
   */
  public void setMaxLong(double maxLong) {
    this.maxLong = maxLong;
  }

  /**
   * @return the minLat
   */
  public double getMinLat() {
    return minLat;
  }

  /**
   * @param minLat the minLat to set
   */
  public void setMinLat(double minLat) {
    this.minLat = minLat;
  }

  /**
   * @return the minLong
   */
  public double getMinLong() {
    return minLong;
  }

  /**
   * @param minLong the minLong to set
   */
  public void setMinLong(double minLong) {
    this.minLong = minLong;
  }
}
