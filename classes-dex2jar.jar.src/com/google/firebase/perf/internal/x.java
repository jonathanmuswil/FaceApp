package com.google.firebase.perf.internal;

import Iv;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import rw;
import rw.a;
import sx.a;
import wv;
import xw;

public class x
  implements Parcelable
{
  public static final Parcelable.Creator<x> CREATOR = new y();
  private String a;
  private boolean b;
  private Iv c;
  
  private x(Parcel paramParcel)
  {
    boolean bool = false;
    this.b = false;
    this.a = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool = true;
    }
    this.b = bool;
    this.c = ((Iv)paramParcel.readParcelable(Iv.class.getClassLoader()));
  }
  
  private x(String paramString, wv paramwv)
  {
    this.b = false;
    this.a = paramString;
    this.c = new Iv();
  }
  
  private static boolean a(boolean paramBoolean, float paramFloat)
  {
    return (paramBoolean) && (Math.random() * 100.0D < paramFloat);
  }
  
  public static rw[] a(List<x> paramList)
  {
    if (paramList.isEmpty()) {
      return null;
    }
    rw[] arrayOfrw = new rw[paramList.size()];
    rw localrw1 = ((x)paramList.get(0)).p();
    int i = 1;
    int j = 0;
    while (i < paramList.size())
    {
      rw localrw2 = ((x)paramList.get(i)).p();
      if ((j == 0) && (((x)paramList.get(i)).b))
      {
        arrayOfrw[0] = localrw2;
        arrayOfrw[i] = localrw1;
        j = 1;
      }
      else
      {
        arrayOfrw[i] = localrw2;
      }
      i++;
    }
    if (j == 0) {
      arrayOfrw[0] = localrw1;
    }
    return arrayOfrw;
  }
  
  public static x m()
  {
    String str1 = UUID.randomUUID().toString().replaceAll("\\-", "");
    x localx = new x(str1, new wv());
    localx.b = a(FeatureControl.zzaq().zzar(), FeatureControl.zzaq().zzau());
    String str2;
    if (localx.b) {
      str2 = "Verbose";
    } else {
      str2 = "Non Verbose";
    }
    Log.d("FirebasePerformance", String.format("Creating a new %s Session: %s", new Object[] { str2, str1 }));
    return localx;
  }
  
  public static boolean q()
  {
    return a(true, 1.0F);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final boolean l()
  {
    return TimeUnit.MICROSECONDS.toMinutes(this.c.n()) > FeatureControl.zzaq().zzaz();
  }
  
  public final String n()
  {
    return this.a;
  }
  
  public final boolean o()
  {
    return this.b;
  }
  
  public final rw p()
  {
    rw.a locala = rw.k();
    locala.a(this.a);
    if (this.b) {
      locala.a(xw.b);
    }
    return (rw)locala.O();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeByte((byte)this.b);
    paramParcel.writeParcelable(this.c, 0);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */