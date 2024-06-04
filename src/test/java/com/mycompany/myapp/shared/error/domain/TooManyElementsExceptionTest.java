package com.mycompany.myapp.shared.error.domain;

import static org.assertj.core.api.Assertions.*;

import com.mycompany.myapp.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class TooManyElementsExceptionTest {

  @Test
  void shouldGetExceptionInformation() {
    TooManyElementsException exception = TooManyElementsException.builder().field("myField").maxSize(1).size(10).build();

    assertThat(exception.type()).isEqualTo(AssertionErrorType.TOO_MANY_ELEMENTS);
    assertThat(exception.field()).isEqualTo("myField");
    assertThat(exception.parameters()).containsOnly(entry("maxSize", "1"), entry("currentSize", "10"));
    assertThat(exception.getMessage()).isEqualTo("Size of collection \"myField\" must be at most 1 but was 10");
  }
}
