import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;

abstract class ir
  extends o<er, Void>
{
  private oP<Void> c;
  
  protected abstract void a(ar paramar)
    throws RemoteException;
  
  protected final void a(Status paramStatus)
  {
    p.a(paramStatus, this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */