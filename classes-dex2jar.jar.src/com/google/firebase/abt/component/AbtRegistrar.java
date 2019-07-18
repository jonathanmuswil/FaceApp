package com.google.firebase.abt.component;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import fQ;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar
  implements j
{
  public List<e<?>> getComponents()
  {
    e.a locala = e.a(a.class);
    locala.a(q.b(Context.class));
    locala.a(q.a(fQ.class));
    locala.a(b.a);
    return Arrays.asList(new e[] { locala.b() });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/abt/component/AbtRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */