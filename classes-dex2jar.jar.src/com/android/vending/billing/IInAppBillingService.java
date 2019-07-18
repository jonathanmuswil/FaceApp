package com.android.vending.billing;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import java.util.List;

public abstract interface IInAppBillingService
  extends IInterface
{
  public abstract int a(int paramInt, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, Bundle paramBundle1, Bundle paramBundle2)
    throws RemoteException;
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, String paramString3)
    throws RemoteException;
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
    throws RemoteException;
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle a(int paramInt, String paramString1, List<String> paramList, String paramString2, String paramString3, String paramString4)
    throws RemoteException;
  
  public abstract int b(int paramInt, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract int b(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle b(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
    throws RemoteException;
  
  public abstract int c(int paramInt, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract Bundle c(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle c(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle getSkuDetails(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements IInAppBillingService
  {
    public a()
    {
      attachInterface(this, "com.android.vending.billing.IInAppBillingService");
    }
    
    public static IInAppBillingService a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
      if ((localIInterface != null) && ((localIInterface instanceof IInAppBillingService))) {
        return (IInAppBillingService)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      String str1 = null;
      Object localObject1 = null;
      String str2 = null;
      Object localObject2 = null;
      Object localObject3 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      String str3 = null;
      Object localObject6 = null;
      if (paramInt1 != 801)
      {
        if (paramInt1 != 1598968902)
        {
          if (paramInt1 != 901)
          {
            if (paramInt1 != 902)
            {
              switch (paramInt1)
              {
              default: 
                return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
              case 12: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = paramParcel1.readInt();
                str1 = paramParcel1.readString();
                localObject5 = paramParcel1.readString();
                localObject2 = localObject6;
                if (paramParcel1.readInt() != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                paramParcel1 = c(paramInt1, str1, (String)localObject5, (Bundle)localObject2);
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              case 11: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = paramParcel1.readInt();
                str2 = paramParcel1.readString();
                str3 = paramParcel1.readString();
                localObject5 = paramParcel1.readString();
                localObject2 = str1;
                if (paramParcel1.readInt() != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                paramParcel1 = b(paramInt1, str2, str3, (String)localObject5, (Bundle)localObject2);
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              case 10: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = paramParcel1.readInt();
                str1 = paramParcel1.readString();
                localObject5 = paramParcel1.readString();
                localObject2 = localObject1;
                if (paramParcel1.readInt() != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                paramInt1 = b(paramInt1, str1, (String)localObject5, (Bundle)localObject2);
                paramParcel2.writeNoException();
                paramParcel2.writeInt(paramInt1);
                return true;
              case 9: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = paramParcel1.readInt();
                localObject5 = paramParcel1.readString();
                str1 = paramParcel1.readString();
                str3 = paramParcel1.readString();
                localObject2 = str2;
                if (paramParcel1.readInt() != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                paramParcel1 = a(paramInt1, (String)localObject5, str1, str3, (Bundle)localObject2);
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              case 8: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = paramParcel1.readInt();
                str1 = paramParcel1.readString();
                str3 = paramParcel1.readString();
                str2 = paramParcel1.readString();
                localObject5 = paramParcel1.readString();
                if (paramParcel1.readInt() != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                paramParcel1 = a(paramInt1, str1, str3, str2, (String)localObject5, (Bundle)localObject2);
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              case 7: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramParcel1 = a(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.createStringArrayList(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              case 6: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = a(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
                paramParcel2.writeNoException();
                paramParcel2.writeInt(paramInt1);
                return true;
              case 5: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = c(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
                paramParcel2.writeNoException();
                paramParcel2.writeInt(paramInt1);
                return true;
              case 4: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramParcel1 = a(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              case 3: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramParcel1 = a(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              case 2: 
                paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
                paramInt1 = paramParcel1.readInt();
                str1 = paramParcel1.readString();
                localObject5 = paramParcel1.readString();
                localObject2 = localObject3;
                if (paramParcel1.readInt() != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                paramParcel1 = getSkuDetails(paramInt1, str1, (String)localObject5, (Bundle)localObject2);
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                }
                return true;
              }
              paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
              paramInt1 = b(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
              paramParcel2.writeNoException();
              paramParcel2.writeInt(paramInt1);
              return true;
            }
            paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
            paramInt1 = paramParcel1.readInt();
            str1 = paramParcel1.readString();
            localObject5 = paramParcel1.readString();
            localObject2 = localObject4;
            if (paramParcel1.readInt() != 0) {
              localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            }
            paramParcel1 = a(paramInt1, str1, (String)localObject5, (Bundle)localObject2);
            paramParcel2.writeNoException();
            if (paramParcel1 != null)
            {
              paramParcel2.writeInt(1);
              paramParcel1.writeToParcel(paramParcel2, 1);
            }
            else
            {
              paramParcel2.writeInt(0);
            }
            return true;
          }
          paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
          paramInt1 = paramParcel1.readInt();
          str1 = paramParcel1.readString();
          str2 = paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          } else {
            localObject2 = null;
          }
          if (paramParcel1.readInt() != 0) {
            localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramParcel1 = a(paramInt1, str1, str2, (Bundle)localObject2, (Bundle)localObject5);
          paramParcel2.writeNoException();
          if (paramParcel1 != null)
          {
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
          }
          else
          {
            paramParcel2.writeInt(0);
          }
          return true;
        }
        paramParcel2.writeString("com.android.vending.billing.IInAppBillingService");
        return true;
      }
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      paramInt1 = paramParcel1.readInt();
      str1 = paramParcel1.readString();
      localObject5 = paramParcel1.readString();
      str2 = paramParcel1.readString();
      localObject2 = str3;
      if (paramParcel1.readInt() != 0) {
        localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      paramParcel1 = c(paramInt1, str1, (String)localObject5, str2, (Bundle)localObject2);
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      else
      {
        paramParcel2.writeInt(0);
      }
      return true;
    }
    
    private static class a
      implements IInAppBillingService
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      public Bundle a(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.a.transact(902, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle a(int paramInt, String paramString1, String paramString2, Bundle paramBundle1, Bundle paramBundle2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramBundle1 != null)
          {
            localParcel1.writeInt(1);
            paramBundle1.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if (paramBundle2 != null)
          {
            localParcel1.writeInt(1);
            paramBundle2.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.a.transact(901, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle a(int paramInt, String paramString1, String paramString2, String paramString3)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          this.a.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          localParcel1.writeString(paramString4);
          this.a.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          localParcel1.writeString(paramString4);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.a.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle a(int paramInt, String paramString1, List<String> paramList, String paramString2, String paramString3, String paramString4)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeStringList(paramList);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          localParcel1.writeString(paramString4);
          this.a.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
      
      public int b(int paramInt, String paramString1, String paramString2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          return paramInt;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int b(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.a.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          return paramInt;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle b(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.a.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle getSkuDetails(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString1 = null;
          }
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/vending/billing/IInAppBillingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */