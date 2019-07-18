package io.faceapp;

import KQa;
import MQa;
import android.support.v7.app.l.a;
import android.widget.EditText;
import android.widget.TextView.BufferType;
import oXa;

final class u<T>
  implements MQa<T>
{
  u(n paramn, String paramString, l.a parama) {}
  
  public final void a(KQa<String> paramKQa)
  {
    oXa.b(paramKQa, "subscriber");
    EditText localEditText = new EditText(n.a(this.a));
    localEditText.setInputType(129);
    localEditText.setText(this.b, TextView.BufferType.EDITABLE);
    localEditText.postDelayed(new s(localEditText), 500L);
    this.c.b(localEditText);
    this.c.b("OK", new p(localEditText, this, paramKQa));
    this.c.a("Cancel", t.a);
    this.c.a(new q(this, paramKQa));
    this.c.a(new r(this, paramKQa));
    this.c.c();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */