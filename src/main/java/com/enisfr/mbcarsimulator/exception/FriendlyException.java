package com.enisfr.mbcarsimulator.exception;

public class FriendlyException extends RuntimeException {

  private final String message =
      " [callerClassName::" + this.getStackTrace()[1].getClassName() + " -> calleeClassName::" + this.getStackTrace()[0]
          .getClassName() + " -> callerMethodName::" + this.getStackTrace()[0].getMethodName() + " -> lineNumber::"
          + this.getStackTrace()[0].getLineNumber() + "]";
  private Object data;

  public FriendlyException() {
  }

  public FriendlyException(String s) {
    super(s);
  }

  public FriendlyException(String s, Object data) {
    super(s);
    this.data = data;
  }

  public FriendlyException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public FriendlyException(Throwable throwable) {
    super(throwable);
  }

  public Object getData() {
    return this.data;
  }

}
