package HRDSystem.exception;

public class ConverterException extends RuntimeException {

  public ConverterException() {
    super();
  }

  public ConverterException(String message) {
    super(message);
  }

  public ConverterException(String message, Throwable cause) {
    super(message, cause);
  }
}
