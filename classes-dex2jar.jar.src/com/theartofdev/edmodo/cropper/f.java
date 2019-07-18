package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class f
  implements Parcelable
{
  public static final Parcelable.Creator<f> CREATOR = new e();
  public int A;
  public int B;
  public int C;
  public CharSequence D;
  public int E;
  public Uri F;
  public Bitmap.CompressFormat G;
  public int H;
  public int I;
  public int J;
  public CropImageView.i K;
  public boolean L;
  public Rect M;
  public int N;
  public boolean O;
  public boolean P;
  public boolean Q;
  public int R;
  public boolean S;
  public boolean T;
  public CharSequence U;
  public int V;
  public CropImageView.b a;
  public float b;
  public float c;
  public CropImageView.c d;
  public CropImageView.j e;
  public boolean f;
  public boolean g;
  public boolean h;
  public boolean i;
  public int j;
  public float k;
  public boolean l;
  public int m;
  public int n;
  public float o;
  public int p;
  public float q;
  public float r;
  public float s;
  public int t;
  public float u;
  public int v;
  public int w;
  public int x;
  public int y;
  public int z;
  
  public f()
  {
    DisplayMetrics localDisplayMetrics = Resources.getSystem().getDisplayMetrics();
    this.a = CropImageView.b.a;
    this.b = TypedValue.applyDimension(1, 3.0F, localDisplayMetrics);
    this.c = TypedValue.applyDimension(1, 24.0F, localDisplayMetrics);
    this.d = CropImageView.c.b;
    this.e = CropImageView.j.a;
    this.f = true;
    this.g = true;
    this.h = true;
    this.i = false;
    this.j = 4;
    this.k = 0.1F;
    this.l = false;
    this.m = 1;
    this.n = 1;
    this.o = TypedValue.applyDimension(1, 3.0F, localDisplayMetrics);
    this.p = Color.argb(170, 255, 255, 255);
    this.q = TypedValue.applyDimension(1, 2.0F, localDisplayMetrics);
    this.r = TypedValue.applyDimension(1, 5.0F, localDisplayMetrics);
    this.s = TypedValue.applyDimension(1, 14.0F, localDisplayMetrics);
    this.t = -1;
    this.u = TypedValue.applyDimension(1, 1.0F, localDisplayMetrics);
    this.v = Color.argb(170, 255, 255, 255);
    this.w = Color.argb(119, 0, 0, 0);
    this.x = ((int)TypedValue.applyDimension(1, 42.0F, localDisplayMetrics));
    this.y = ((int)TypedValue.applyDimension(1, 42.0F, localDisplayMetrics));
    this.z = 40;
    this.A = 40;
    this.B = 99999;
    this.C = 99999;
    this.D = "";
    this.E = 0;
    this.F = Uri.EMPTY;
    this.G = Bitmap.CompressFormat.JPEG;
    this.H = 90;
    this.I = 0;
    this.J = 0;
    this.K = CropImageView.i.a;
    this.L = false;
    this.M = null;
    this.N = -1;
    this.O = true;
    this.P = true;
    this.Q = false;
    this.R = 90;
    this.S = false;
    this.T = false;
    this.U = null;
    this.V = 0;
  }
  
  protected f(Parcel paramParcel)
  {
    this.a = CropImageView.b.values()[paramParcel.readInt()];
    this.b = paramParcel.readFloat();
    this.c = paramParcel.readFloat();
    this.d = CropImageView.c.values()[paramParcel.readInt()];
    this.e = CropImageView.j.values()[paramParcel.readInt()];
    int i1 = paramParcel.readByte();
    boolean bool1 = true;
    boolean bool2;
    if (i1 != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.f = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.g = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.h = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.i = bool2;
    this.j = paramParcel.readInt();
    this.k = paramParcel.readFloat();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.l = bool2;
    this.m = paramParcel.readInt();
    this.n = paramParcel.readInt();
    this.o = paramParcel.readFloat();
    this.p = paramParcel.readInt();
    this.q = paramParcel.readFloat();
    this.r = paramParcel.readFloat();
    this.s = paramParcel.readFloat();
    this.t = paramParcel.readInt();
    this.u = paramParcel.readFloat();
    this.v = paramParcel.readInt();
    this.w = paramParcel.readInt();
    this.x = paramParcel.readInt();
    this.y = paramParcel.readInt();
    this.z = paramParcel.readInt();
    this.A = paramParcel.readInt();
    this.B = paramParcel.readInt();
    this.C = paramParcel.readInt();
    this.D = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.E = paramParcel.readInt();
    this.F = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    this.G = Bitmap.CompressFormat.valueOf(paramParcel.readString());
    this.H = paramParcel.readInt();
    this.I = paramParcel.readInt();
    this.J = paramParcel.readInt();
    this.K = CropImageView.i.values()[paramParcel.readInt()];
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.L = bool2;
    this.M = ((Rect)paramParcel.readParcelable(Rect.class.getClassLoader()));
    this.N = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.O = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.P = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.Q = bool2;
    this.R = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.S = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    this.T = bool2;
    this.U = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.V = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void l()
  {
    if (this.j >= 0)
    {
      if (this.c >= 0.0F)
      {
        float f1 = this.k;
        if ((f1 >= 0.0F) && (f1 < 0.5D))
        {
          if (this.m > 0)
          {
            if (this.n > 0)
            {
              if (this.o >= 0.0F)
              {
                if (this.q >= 0.0F)
                {
                  if (this.u >= 0.0F)
                  {
                    if (this.y >= 0)
                    {
                      int i1 = this.z;
                      if (i1 >= 0)
                      {
                        int i2 = this.A;
                        if (i2 >= 0)
                        {
                          if (this.B >= i1)
                          {
                            if (this.C >= i2)
                            {
                              if (this.I >= 0)
                              {
                                if (this.J >= 0)
                                {
                                  i2 = this.R;
                                  if ((i2 >= 0) && (i2 <= 360)) {
                                    return;
                                  }
                                  throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                                }
                                throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                              }
                              throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                            }
                            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                          }
                          throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                        }
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                      }
                      throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                    }
                    throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
                  }
                  throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
                }
                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
              }
              throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
            }
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
          }
          throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
      }
      throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
    }
    throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a.ordinal());
    paramParcel.writeFloat(this.b);
    paramParcel.writeFloat(this.c);
    paramParcel.writeInt(this.d.ordinal());
    paramParcel.writeInt(this.e.ordinal());
    paramParcel.writeByte((byte)this.f);
    paramParcel.writeByte((byte)this.g);
    paramParcel.writeByte((byte)this.h);
    paramParcel.writeByte((byte)this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeFloat(this.k);
    paramParcel.writeByte((byte)this.l);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeFloat(this.o);
    paramParcel.writeInt(this.p);
    paramParcel.writeFloat(this.q);
    paramParcel.writeFloat(this.r);
    paramParcel.writeFloat(this.s);
    paramParcel.writeInt(this.t);
    paramParcel.writeFloat(this.u);
    paramParcel.writeInt(this.v);
    paramParcel.writeInt(this.w);
    paramParcel.writeInt(this.x);
    paramParcel.writeInt(this.y);
    paramParcel.writeInt(this.z);
    paramParcel.writeInt(this.A);
    paramParcel.writeInt(this.B);
    paramParcel.writeInt(this.C);
    TextUtils.writeToParcel(this.D, paramParcel, paramInt);
    paramParcel.writeInt(this.E);
    paramParcel.writeParcelable(this.F, paramInt);
    paramParcel.writeString(this.G.name());
    paramParcel.writeInt(this.H);
    paramParcel.writeInt(this.I);
    paramParcel.writeInt(this.J);
    paramParcel.writeInt(this.K.ordinal());
    paramParcel.writeInt(this.L);
    paramParcel.writeParcelable(this.M, paramInt);
    paramParcel.writeInt(this.N);
    paramParcel.writeByte((byte)this.O);
    paramParcel.writeByte((byte)this.P);
    paramParcel.writeByte((byte)this.Q);
    paramParcel.writeInt(this.R);
    paramParcel.writeByte((byte)this.S);
    paramParcel.writeByte((byte)this.T);
    TextUtils.writeToParcel(this.U, paramParcel, paramInt);
    paramParcel.writeInt(this.V);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */