package android.support.v7.app;

import android.support.v4.view.N;
import android.support.v4.view.y;
import android.view.View;

class r
  implements android.support.v4.view.r
{
  r(x paramx) {}
  
  public N a(View paramView, N paramN)
  {
    int i = paramN.e();
    int j = this.a.i(i);
    N localN = paramN;
    if (i != j) {
      localN = paramN.a(paramN.c(), j, paramN.d(), paramN.b());
    }
    return y.b(paramView, localN);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */