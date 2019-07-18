package com.google.firebase.messaging;

import java.util.Locale;

public final class d
  extends Exception
{
  private final int a;
  
  d(String paramString)
  {
    super(paramString);
    int i = 0;
    int j = i;
    if (paramString != null)
    {
      paramString = paramString.toLowerCase(Locale.US);
      j = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case -95047692: 
        if (paramString.equals("missing_to")) {
          j = 1;
        }
        break;
      case -617027085: 
        if (paramString.equals("messagetoobig")) {
          j = 2;
        }
        break;
      case -920906446: 
        if (paramString.equals("invalid_parameters")) {
          j = 0;
        }
        break;
      case -1290953729: 
        if (paramString.equals("toomanymessages")) {
          j = 4;
        }
        break;
      case -1743242157: 
        if (paramString.equals("service_not_available")) {
          j = 3;
        }
        break;
      }
      if ((j != 0) && (j != 1))
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 4) {
              j = i;
            } else {
              j = 4;
            }
          }
          else {
            j = 3;
          }
        }
        else {
          j = 2;
        }
      }
      else {
        j = 1;
      }
    }
    this.a = j;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/messaging/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */