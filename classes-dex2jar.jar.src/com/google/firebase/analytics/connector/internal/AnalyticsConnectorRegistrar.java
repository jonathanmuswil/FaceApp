package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import fQ;
import java.util.Collections;
import java.util.List;
import mQ;

@Keep
public class AnalyticsConnectorRegistrar
  implements j
{
  @SuppressLint({"MissingPermission"})
  @Keep
  public List<e<?>> getComponents()
  {
    e.a locala = e.a(fQ.class);
    locala.a(q.b(FirebaseApp.class));
    locala.a(q.b(Context.class));
    locala.a(q.b(mQ.class));
    locala.a(a.a);
    locala.c();
    return Collections.singletonList(locala.b());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */