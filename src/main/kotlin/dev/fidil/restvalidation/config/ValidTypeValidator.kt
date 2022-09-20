package dev.fidil.restvalidation.config

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext
import kotlin.reflect.KClass

class ValidTypeValidator: ConstraintValidator<ValidType, KClass<*>> {

    private var enumType: KClass<*> = Enum::class

    override fun initialize(validTypeAnnotation: ValidType) {
         enumType = validTypeAnnotation.type
    }
    override fun isValid(value: KClass<*>, context: ConstraintValidatorContext): Boolean {
        return enumType == value
    }
}