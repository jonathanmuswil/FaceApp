package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.concurrent.atomic.AtomicLong;

public class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new b();
  private final String a;
  private AtomicLong b;
  
  private a(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = new AtomicLong(paramParcel.readLong());
  }
  
  public a(String paramString)
  {
    this.a = paramString;
    this.b = new AtomicLong(0L);
  }
  
  public final void a(long paramLong)
  {
    this.b.addAndGet(paramLong);
  }
  
  final void b(long paramLong)
  {
    this.b.set(paramLong);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  final long l()
  {
    return this.b.get();
  }
  
  final String m()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeLong(this.b.get());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/metrics/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */