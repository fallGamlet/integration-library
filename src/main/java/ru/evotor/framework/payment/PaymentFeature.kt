package ru.evotor.framework.payment

/**
 * Признак способа расчета для позиции
 */
enum class PaymentFeature {

    /**
     * Полная предварительная оплата до момента передачи предмета расчета
     */
    PREPAYMENT_FULL,

    /**
     * Частичная предварительная оплата до момента передачи предмета расчета
     */
    PREPAYMENT_PARTIAL,

    /**
     * Аванс
     */
    ADVANCE,

    /**
     * Полная оплата, в том числе с учетом аванса (предварительной оплаты) в момент передачи предмета расчета
     */
    CHECKOUT_FULL,

    /**
     * Частичная оплата предмета расчета в момент его передачи с последующей оплатой в кредит
     */
    CHECKOUT_PARTIAL,

    /**
     * Передача предмета расчета без его оплаты в момент его передачи с последующей оплатой в кредит
     */
    CREDIT_PASS,

    /**
     * Оплата предмета расчета после его передачи с оплатой в кредит (оплата кредита)
     */
    CREDIT_CHECKOUT
}
