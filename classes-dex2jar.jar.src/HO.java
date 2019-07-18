import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.b;
import com.facebook.internal.S;
import java.math.BigDecimal;
import java.util.Currency;

class ho
  extends AppEventsLogger
{
  ho(Context paramContext)
  {
    this(S.b(paramContext), null, null);
  }
  
  ho(String paramString1, String paramString2, b paramb)
  {
    super(paramString1, paramString2, paramb);
  }
  
  protected void a(String paramString, BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    super.a(paramString, paramBigDecimal, paramCurrency, paramBundle);
  }
  
  protected void b(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    super.b(paramBigDecimal, paramCurrency, paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */