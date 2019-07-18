package com.facebook.accountkit.internal;

import Vm;
import Vm.a;
import Wm;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;

final class j
  extends AsyncTask<Void, Void, l>
{
  private static final String a = "com.facebook.accountkit.internal.j";
  private static volatile j b;
  private final f.a c;
  private final HttpURLConnection d;
  private Exception e;
  private final int f;
  private final f g;
  
  j(f paramf, f.a parama)
  {
    this(null, paramf, parama, 0);
  }
  
  private j(HttpURLConnection paramHttpURLConnection, f paramf, f.a parama, int paramInt)
  {
    this.d = paramHttpURLConnection;
    this.g = paramf;
    this.c = parama;
    this.f = paramInt;
  }
  
  static j a()
  {
    j localj = b;
    if (localj != null) {
      localj.cancel(true);
    }
    return localj;
  }
  
  static j b()
  {
    return b;
  }
  
  static void d(j paramj)
  {
    b = paramj;
  }
  
  protected l a(Void... paramVarArgs)
  {
    try
    {
      if (this.d == null) {
        return this.g.b();
      }
      paramVarArgs = f.a(this.d, this.g);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      this.e = paramVarArgs;
    }
    return null;
  }
  
  protected void a(l paraml)
  {
    super.onPostExecute(paraml);
    if ((paraml != null) && (paraml.a() != null) && (paraml.a().d().a().m() == Vm.a.a) && (paraml.a().d().a().l() != 101) && (this.f < 4))
    {
      new Handler(c.f().getMainLooper()).post(new i(this));
      return;
    }
    f.a locala = this.c;
    if (locala != null) {
      locala.a(paraml);
    }
    paraml = this.e;
    if (paraml != null) {
      Log.d(a, String.format("onPostExecute: exception encountered during request: %s", new Object[] { paraml.getMessage() }));
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.g.d() == null)
    {
      Handler localHandler;
      if ((Thread.currentThread() instanceof HandlerThread)) {
        localHandler = new Handler();
      } else {
        localHandler = new Handler(Looper.getMainLooper());
      }
      this.g.a(localHandler);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{AccountKitGraphRequestAsyncTask:  connection: ");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", request: ");
    localStringBuilder.append(this.g);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */