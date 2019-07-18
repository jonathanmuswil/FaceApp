package com.google.firebase.remoteconfig;

import AC;
import android.content.Context;
import com.google.firebase.FirebaseApp;
import dQ;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import lA;
import nC;
import nP;
import uC;
import xC;
import zC;

public class a
{
  public static final byte[] a = new byte[0];
  private final Context b;
  private final FirebaseApp c;
  private final dQ d;
  private final Executor e;
  private final nC f;
  private final nC g;
  private final nC h;
  private final xC i;
  private final zC j;
  private final AC k;
  
  a(Context paramContext, FirebaseApp paramFirebaseApp, dQ paramdQ, Executor paramExecutor, nC paramnC1, nC paramnC2, nC paramnC3, xC paramxC, zC paramzC, AC paramAC)
  {
    this.b = paramContext;
    this.c = paramFirebaseApp;
    this.d = paramdQ;
    this.e = paramExecutor;
    this.f = paramnC1;
    this.g = paramnC2;
    this.h = paramnC3;
    this.i = paramxC;
    this.j = paramzC;
    this.k = paramAC;
  }
  
  public static a d()
  {
    return ((h)FirebaseApp.getInstance().a(h.class)).a("firebase");
  }
  
  public String a(String paramString)
  {
    return this.j.a(paramString);
  }
  
  public nP<Void> a(long paramLong)
  {
    nP localnP = this.i.a(this.k.b(), paramLong);
    localnP.a(this.e, new l(this));
    return localnP.a(m.a);
  }
  
  public void a(g paramg)
  {
    this.k.a(paramg.a());
    if (paramg.a()) {
      Logger.getLogger(lA.class.getName()).setLevel(Level.CONFIG);
    }
  }
  
  public boolean a()
  {
    uC localuC1 = this.f.b();
    if (localuC1 == null) {
      return false;
    }
    uC localuC2 = this.g.b();
    int m;
    if ((localuC2 != null) && (localuC1.b().equals(localuC2.b()))) {
      m = 0;
    } else {
      m = 1;
    }
    if (m == 0) {
      return false;
    }
    this.g.a(localuC1).a(this.e, new i(this));
    return true;
  }
  
  public nP<Void> b()
  {
    nP localnP = this.i.a(this.k.b());
    localnP.a(this.e, new j(this));
    return localnP.a(k.a);
  }
  
  public f c()
  {
    return this.k.a();
  }
  
  final void e()
  {
    this.f.c();
    this.g.c();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/remoteconfig/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */