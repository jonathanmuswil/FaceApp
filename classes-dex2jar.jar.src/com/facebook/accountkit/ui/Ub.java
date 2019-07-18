package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ub
  extends O
{
  public static final Parcelable.Creator<ub> CREATOR = new sb();
  private final a g;
  private final int h;
  private final int i;
  private final b j;
  private final double k;
  
  private ub(Parcel paramParcel)
  {
    super(paramParcel);
    this.g = a.values()[paramParcel.readInt()];
    this.h = paramParcel.readInt();
    this.i = paramParcel.readInt();
    this.j = b.values()[paramParcel.readInt()];
    this.k = paramParcel.readDouble();
  }
  
  public ub(a parama, int paramInt)
  {
    this(parama, paramInt, -1, b.a, 0.55D);
  }
  
  public ub(a parama, int paramInt1, int paramInt2, b paramb, double paramDouble)
  {
    super(-1);
    this.g = parama;
    this.h = paramInt1;
    this.i = paramInt2;
    if (t())
    {
      this.j = paramb;
      this.k = Math.min(0.85D, Math.max(0.55D, paramDouble));
    }
    else
    {
      this.j = b.a;
      this.k = 0.55D;
    }
  }
  
  public Cb a(Ga paramGa)
  {
    return super.a(paramGa);
  }
  
  int b(int paramInt)
  {
    int m;
    if (tb.a[this.j.ordinal()] != 1) {
      m = -16777216;
    } else {
      m = -1;
    }
    double d1 = Color.red(paramInt);
    double d2 = Color.red(m);
    double d3 = Color.green(paramInt);
    double d4 = Color.green(m);
    double d5 = Color.blue(paramInt);
    double d6 = Color.blue(m);
    return Color.rgb((int)(d1 * 0.25D + d2 * 0.75D), (int)(d3 * 0.25D + d4 * 0.75D), (int)(d5 * 0.25D + d6 * 0.75D));
  }
  
  public Fragment b(Ga paramGa)
  {
    return super.b(paramGa);
  }
  
  public Fragment c(Ga paramGa)
  {
    return super.c(paramGa);
  }
  
  public Q d(Ga paramGa)
  {
    return super.d(paramGa);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Fragment e(Ga paramGa)
  {
    return super.e(paramGa);
  }
  
  int m()
  {
    return this.i;
  }
  
  public int n()
  {
    return this.h;
  }
  
  public a o()
  {
    return this.g;
  }
  
  int p()
  {
    int m;
    if (tb.a[q().ordinal()] != 2) {
      m = -16777216;
    } else {
      m = -1;
    }
    return m;
  }
  
  public b q()
  {
    return this.j;
  }
  
  int r()
  {
    int m;
    if (tb.a[this.j.ordinal()] != 1) {
      m = Color.argb((int)(this.k * 255.0D), 0, 0, 0);
    } else {
      m = Color.argb((int)(this.k * 255.0D), 255, 255, 255);
    }
    return m;
  }
  
  public double s()
  {
    return this.k;
  }
  
  public boolean t()
  {
    boolean bool;
    if (this.i >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.g.ordinal());
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j.ordinal());
    paramParcel.writeDouble(this.k);
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */