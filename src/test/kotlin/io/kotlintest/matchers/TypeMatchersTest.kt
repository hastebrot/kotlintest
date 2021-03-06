package io.kotlintest.matchers

import io.kotlintest.specs.WordSpec

class TypeMatchersTest : WordSpec() {

  init {

    "TypeMatchers.theSameInstanceAs" should {
      "should test that references are equal" {
        val b = listOf(1, 2, 3)
        val a = b
        val c = listOf(1, 2, 3)

        a should be theSameInstanceAs b
        shouldThrow<AssertionError> {
          a should be theSameInstanceAs c
        }
      }
    }

    "beTheSameInstanceAs" should {
      "should test that references are equal" {
        val b = listOf(1, 2, 3)
        val a = b
        val c = listOf(1, 2, 3)

        a should beTheSameInstanceAs(b)
        shouldThrow<AssertionError> {
          a should be theSameInstanceAs c
        }
      }
    }
  }
}