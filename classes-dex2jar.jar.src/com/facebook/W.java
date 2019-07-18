package com.facebook;

import android.content.Context;
import com.facebook.appevents.AppEventsLogger;
import java.util.concurrent.Callable;

final class w
  implements Callable<Void>
{
  w(FacebookSdk.a parama, Context paramContext) {}
  
  public Void call()
    throws Exception
  {
    h.d().e();
    Q.b().c();
    if ((b.w()) && (O.n() == null)) {
      O.m();
    }
    FacebookSdk.a locala = this.a;
    if (locala != null) {
      locala.a();
    }
    AppEventsLogger.a(FacebookSdk.a(), FacebookSdk.b());
    AppEventsLogger.newLogger(this.b.getApplicationContext()).b();
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */