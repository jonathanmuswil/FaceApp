package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.h;
import android.support.v4.app.o;
import com.facebook.b;
import com.facebook.i;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class n
  extends K
{
  public static final Parcelable.Creator<n> CREATOR = new m();
  private static ScheduledThreadPoolExecutor c;
  
  protected n(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  n(z paramz)
  {
    super(paramz);
  }
  
  private void b(z.c paramc)
  {
    l locall = o();
    locall.a(this.b.n().e(), "login_with_facebook");
    locall.a(paramc);
  }
  
  public static ScheduledThreadPoolExecutor p()
  {
    try
    {
      if (c == null)
      {
        localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        c = localScheduledThreadPoolExecutor;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = c;
      return localScheduledThreadPoolExecutor;
    }
    finally {}
  }
  
  public void a(Exception paramException)
  {
    paramException = z.d.a(this.b.t(), null, paramException.getMessage());
    this.b.b(paramException);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, Collection<String> paramCollection1, Collection<String> paramCollection2, i parami, Date paramDate1, Date paramDate2, Date paramDate3)
  {
    paramString1 = new b(paramString1, paramString2, paramString3, paramCollection1, paramCollection2, parami, paramDate1, paramDate2, paramDate3);
    paramString1 = z.d.a(this.b.t(), paramString1);
    this.b.b(paramString1);
  }
  
  boolean a(z.c paramc)
  {
    b(paramc);
    return true;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  String m()
  {
    return "device_auth";
  }
  
  protected l o()
  {
    return new l();
  }
  
  public void q()
  {
    z.d locald = z.d.a(this.b.t(), "User canceled log in.");
    this.b.b(locald);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */