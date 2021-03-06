package com.neusoft.ssp.aidl;

import android.os.IBinder;
import android.os.Parcel;

final class b
  implements MyAIDL
{
  private IBinder a;

  b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final void register(String paramString, ITaskCallback paramITaskCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.zxl.aidl.aidl.MyAIDL");
      localParcel1.writeString(paramString);
      if (paramITaskCallback != null);
      for (paramString = paramITaskCallback.asBinder(); ; paramString = null)
      {
        localParcel1.writeStrongBinder(paramString);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw paramString;
  }

  public final void send(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.zxl.aidl.aidl.MyAIDL");
      localParcel1.writeString(paramString);
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw paramString;
  }
}

/* Location:           C:\Users\User\dex2jar-2.0\dex\qting\classes-dex2jar.jar
 * Qualified Name:     com.neusoft.ssp.aidl.b
 * JD-Core Version:    0.6.2
 */