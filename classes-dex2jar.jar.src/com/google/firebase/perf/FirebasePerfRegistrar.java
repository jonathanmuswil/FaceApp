package com.google.firebase.perf;

import android.support.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import com.google.firebase.remoteconfig.h;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebasePerfRegistrar
  implements j
{
  @Keep
  public List<e<?>> getComponents()
  {
    e.a locala = e.a(a.class);
    locala.a(q.b(FirebaseApp.class));
    locala.a(q.b(h.class));
    locala.a(b.a);
    return Arrays.asList(new e[] { locala.b() });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/FirebasePerfRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */