package com.google.firebase.remoteconfig;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import com.google.firebase.iid.FirebaseInstanceId;
import fQ;
import java.util.Arrays;
import java.util.List;

@Keep
public class RemoteConfigRegistrar
  implements j
{
  public List<e<?>> getComponents()
  {
    e.a locala = e.a(h.class);
    locala.a(q.b(Context.class));
    locala.a(q.b(FirebaseApp.class));
    locala.a(q.b(FirebaseInstanceId.class));
    locala.a(q.b(a.class));
    locala.a(q.a(fQ.class));
    locala.a(r.a);
    locala.a();
    return Arrays.asList(new e[] { locala.b() });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/remoteconfig/RemoteConfigRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */