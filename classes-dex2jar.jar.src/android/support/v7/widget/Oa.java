package android.support.v7.widget;

import android.view.View;

class oa
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f = 0;
  int g = 0;
  boolean h;
  boolean i;
  
  View a(RecyclerView.p paramp)
  {
    paramp = paramp.d(this.c);
    this.c += this.d;
    return paramp;
  }
  
  boolean a(RecyclerView.u paramu)
  {
    int j = this.c;
    boolean bool;
    if ((j >= 0) && (j < paramu.a())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LayoutState{mAvailable=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", mCurrentPosition=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", mItemDirection=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", mLayoutDirection=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", mStartLine=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", mEndLine=");
    localStringBuilder.append(this.g);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */