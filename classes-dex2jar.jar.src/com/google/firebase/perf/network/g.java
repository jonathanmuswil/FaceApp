package com.google.firebase.perf.network;

import BZa;
import Iv;
import YYa;
import ZYa;
import java.io.IOException;
import java.net.URL;
import pZa;
import vv;
import xZa;

public final class g
  implements ZYa
{
  private final ZYa a;
  private final vv b;
  private final long c;
  private final Iv d;
  
  public g(ZYa paramZYa, com.google.firebase.perf.internal.h paramh, Iv paramIv, long paramLong)
  {
    this.a = paramZYa;
    this.b = vv.a(paramh);
    this.c = paramLong;
    this.d = paramIv;
  }
  
  public final void a(YYa paramYYa, BZa paramBZa)
    throws IOException
  {
    long l = this.d.n();
    FirebasePerfOkHttpClient.a(paramBZa, this.b, this.c, l);
    this.a.a(paramYYa, paramBZa);
  }
  
  public final void a(YYa paramYYa, IOException paramIOException)
  {
    xZa localxZa = paramYYa.N();
    if (localxZa != null)
    {
      pZa localpZa = localxZa.g();
      if (localpZa != null) {
        this.b.a(localpZa.p().toString());
      }
      if (localxZa.e() != null) {
        this.b.b(localxZa.e());
      }
    }
    this.b.b(this.c);
    this.b.e(this.d.n());
    h.a(this.b);
    this.a.a(paramYYa, paramIOException);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */