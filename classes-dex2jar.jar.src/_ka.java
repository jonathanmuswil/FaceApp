import android.os.Bundle;
import android.support.v4.app.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.faceapp.MainActivity;
import io.faceapp.n;

public abstract class _ka<V extends sla, P extends gla<V>>
  extends ola<V, P>
{
  public abstract int Tb();
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    oXa.b(paramLayoutInflater, "inflater");
    paramLayoutInflater = paramLayoutInflater.inflate(Tb(), paramViewGroup, false);
    oXa.a(paramLayoutInflater, "inflater.inflate(layoutId, container, false)");
    return paramLayoutInflater;
  }
  
  public n getRouter()
  {
    Object localObject1 = Ea();
    boolean bool = localObject1 instanceof MainActivity;
    Object localObject2 = null;
    if (!bool) {
      localObject1 = null;
    }
    MainActivity localMainActivity = (MainActivity)localObject1;
    localObject1 = localObject2;
    if (localMainActivity != null) {
      localObject1 = localMainActivity.n();
    }
    return (n)localObject1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */