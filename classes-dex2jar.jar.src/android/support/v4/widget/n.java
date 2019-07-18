package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class n
{
  public static void a(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramEdgeEffect.onPull(paramFloat1, paramFloat2);
    } else {
      paramEdgeEffect.onPull(paramFloat1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */