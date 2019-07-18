package com.google.android.gms.internal.ads;

public enum uda
  implements sR
{
  private static final tR<uda> M = new vda();
  private final int O;
  
  static
  {
    A = new uda("REQUEST_WILL_UPDATE_GMS_SIGNALS", 26, 1000);
    B = new uda("REQUEST_DID_UPDATE_GMS_SIGNALS", 27, 1001);
    C = new uda("REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS", 28, 1002);
    D = new uda("REQUEST_FAILED_TO_BUILD_URL", 29, 1003);
    E = new uda("REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST", 30, 1004);
    F = new uda("REQUEST_FAILED_TO_PROCESS_RESPONSE", 31, 1005);
    G = new uda("REQUEST_FAILED_TO_UPDATE_SIGNALS", 32, 1006);
    H = new uda("REQUEST_FAILED_TO_RENDER", 33, 1007);
    I = new uda("BANNER_SIZE_INVALID", 34, 10000);
    J = new uda("BANNER_SIZE_VALID", 35, 10001);
    K = new uda("ANDROID_WEBVIEW_CRASH", 36, 10002);
    L = new uda("OFFLINE_UPLOAD", 37, 10003);
    N = new uda[] { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L };
  }
  
  private uda(int paramInt)
  {
    this.O = paramInt;
  }
  
  public final int n()
  {
    return this.O;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */