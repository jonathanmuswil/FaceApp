import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.G;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v4.app.s;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.E;
import com.facebook.J;
import com.facebook.common.b;
import com.facebook.common.c;
import com.facebook.common.d;
import com.facebook.common.e;
import com.facebook.internal.T;
import com.facebook.t;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class uo
  extends h
{
  private static ScheduledThreadPoolExecutor ha;
  private ProgressBar ia;
  private TextView ja;
  private Dialog ka;
  private volatile uo.a la;
  private volatile ScheduledFuture ma;
  private zo na;
  
  private void Ob()
  {
    if (hb())
    {
      G localG = Qa().a();
      localG.a(this);
      localG.a();
    }
  }
  
  private static ScheduledThreadPoolExecutor Pb()
  {
    try
    {
      if (ha == null)
      {
        localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        ha = localScheduledThreadPoolExecutor;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = ha;
      return localScheduledThreadPoolExecutor;
    }
    finally {}
  }
  
  private Bundle Qb()
  {
    zo localzo = this.na;
    if (localzo == null) {
      return null;
    }
    if ((localzo instanceof Do)) {
      return yo.a((Do)localzo);
    }
    if ((localzo instanceof Ko)) {
      return yo.a((Ko)localzo);
    }
    return null;
  }
  
  private void Rb()
  {
    Bundle localBundle = Qb();
    if ((localBundle == null) || (localBundle.size() == 0)) {
      a(new t(0, "", "Failed to get share content"));
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(T.a());
    localStringBuilder.append("|");
    localStringBuilder.append(T.b());
    localBundle.putString("access_token", localStringBuilder.toString());
    localBundle.putString("device_info", oo.a());
    new E(null, "device/share", localBundle, J.b, new ro(this)).c();
  }
  
  private void a(int paramInt, Intent paramIntent)
  {
    if (this.la != null) {
      oo.a(this.la.m());
    }
    Object localObject = (t)paramIntent.getParcelableExtra("error");
    if (localObject != null) {
      Toast.makeText(La(), ((t)localObject).n(), 0).show();
    }
    if (hb())
    {
      localObject = Ea();
      ((Activity)localObject).setResult(paramInt, paramIntent);
      ((Activity)localObject).finish();
    }
  }
  
  private void a(t paramt)
  {
    Ob();
    Intent localIntent = new Intent();
    localIntent.putExtra("error", paramt);
    a(-1, localIntent);
  }
  
  private void a(uo.a parama)
  {
    this.la = parama;
    this.ja.setText(parama.m());
    this.ja.setVisibility(0);
    this.ia.setVisibility(8);
    this.ma = Pb().schedule(new so(this), parama.l(), TimeUnit.SECONDS);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    if (paramBundle != null)
    {
      paramViewGroup = (uo.a)paramBundle.getParcelable("request_state");
      if (paramViewGroup != null) {
        a(paramViewGroup);
      }
    }
    return paramLayoutInflater;
  }
  
  public void a(zo paramzo)
  {
    this.na = paramzo;
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.la != null) {
      paramBundle.putParcelable("request_state", this.la);
    }
  }
  
  public Dialog n(Bundle paramBundle)
  {
    this.ka = new Dialog(Ea(), e.com_facebook_auth_dialog);
    paramBundle = Ea().getLayoutInflater().inflate(c.com_facebook_device_auth_dialog_fragment, null);
    this.ia = ((ProgressBar)paramBundle.findViewById(b.progress_bar));
    this.ja = ((TextView)paramBundle.findViewById(b.confirmation_code));
    ((Button)paramBundle.findViewById(b.cancel_button)).setOnClickListener(new qo(this));
    ((TextView)paramBundle.findViewById(b.com_facebook_device_auth_instructions)).setText(Html.fromHtml(b(d.com_facebook_device_auth_instructions)));
    this.ka.setContentView(paramBundle);
    Rb();
    return this.ka;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (this.ma != null) {
      this.ma.cancel(true);
    }
    a(-1, new Intent());
  }
  
  private static class a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new to();
    private String a;
    private long b;
    
    a() {}
    
    protected a(Parcel paramParcel)
    {
      this.a = paramParcel.readString();
      this.b = paramParcel.readLong();
    }
    
    public void a(long paramLong)
    {
      this.b = paramLong;
    }
    
    public void a(String paramString)
    {
      this.a = paramString;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public long l()
    {
      return this.b;
    }
    
    public String m()
    {
      return this.a;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.a);
      paramParcel.writeLong(this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */