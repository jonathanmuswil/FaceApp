package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.facebook.accountkit.internal.va;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tn;

public abstract class vb
  extends tn
{
  private static final Pattern e = Pattern.compile("(\\d{6})(?=.*\\bAccount Kit\\b)(?=.*\\bFacebook\\b)");
  
  public vb()
  {
    f();
  }
  
  static boolean a(Context paramContext, g paramg)
  {
    if (!paramg.w()) {
      return false;
    }
    if (va.d(paramContext)) {
      return true;
    }
    return va.f(paramContext);
  }
  
  static String b(String paramString)
  {
    paramString = e.matcher(paramString);
    if (paramString.find()) {
      return paramString.group(1);
    }
    return null;
  }
  
  protected List<String> a()
  {
    return Arrays.asList(new String[] { "android.provider.Telephony.SMS_RECEIVED", "com.facebook.accountkit.SMS_RECIEVED", "com.google.android.gms.auth.api.phone.SMS_RETRIEVED" });
  }
  
  protected void a(Intent paramIntent)
  {
    Object localObject;
    if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(paramIntent.getAction()))
    {
      paramIntent = paramIntent.getExtras();
      localObject = (Status)paramIntent.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
      if ((localObject != null) && (((Status)localObject).y() == 0)) {
        paramIntent = (String)paramIntent.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
      } else {
        paramIntent = null;
      }
    }
    else
    {
      localObject = (Object[])paramIntent.getSerializableExtra("pdus");
      paramIntent = new StringBuilder();
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        paramIntent.append(SmsMessage.createFromPdu((byte[])localObject[j]).getDisplayMessageBody());
      }
      paramIntent = paramIntent.toString();
    }
    if (paramIntent != null)
    {
      paramIntent = b(paramIntent);
      if (paramIntent != null) {
        a(paramIntent);
      }
    }
  }
  
  protected abstract void a(String paramString);
  
  protected boolean b()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */