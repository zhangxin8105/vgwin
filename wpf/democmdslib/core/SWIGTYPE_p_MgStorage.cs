/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace democmds.core {

using System;
using System.Runtime.InteropServices;

public class SWIGTYPE_p_MgStorage {
  private HandleRef swigCPtr;

  internal SWIGTYPE_p_MgStorage(IntPtr cPtr, bool futureUse) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  protected SWIGTYPE_p_MgStorage() {
    swigCPtr = new HandleRef(null, IntPtr.Zero);
  }

  internal static HandleRef getCPtr(SWIGTYPE_p_MgStorage obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
}

}
