package com.google.firebase.iid;

import android.support.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;
import mQ;
import nQ;
import wQ;

@Keep
public final class Registrar
  implements j
{
  @Keep
  public final List<e<?>> getComponents()
  {
    e.a locala = e.a(FirebaseInstanceId.class);
    locala.a(q.b(FirebaseApp.class));
    locala.a(q.b(mQ.class));
    locala.a(q.b(wQ.class));
    locala.a(r.a);
    locala.a();
    e locale = locala.b();
    locala = e.a(nQ.class);
    locala.a(q.b(FirebaseInstanceId.class));
    locala.a(s.a);
    return Arrays.asList(new e[] { locale, locala.b() });
  }
  
  private static final class a
    implements nQ
  {
    private final FirebaseInstanceId a;
    
    public a(FirebaseInstanceId paramFirebaseInstanceId)
    {
      this.a = paramFirebaseInstanceId;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/Registrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */