/* tslint:disable */
/* eslint-disable */
/**
 * Enum test
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { NumberEnum } from './NumberEnum';
import {
    NumberEnumFromJSON,
    NumberEnumFromJSONTyped,
    NumberEnumToJSON,
    NumberEnumToJSONTyped,
} from './NumberEnum';
import type { StringEnum } from './StringEnum';
import {
    StringEnumFromJSON,
    StringEnumFromJSONTyped,
    StringEnumToJSON,
    StringEnumToJSONTyped,
} from './StringEnum';

/**
 * 
 * @export
 * @interface EnumPatternObject
 */
export interface EnumPatternObject {
    /**
     * 
     * @type {StringEnum}
     * @memberof EnumPatternObject
     */
    stringEnum?: StringEnum;
    /**
     * 
     * @type {StringEnum}
     * @memberof EnumPatternObject
     */
    nullableStringEnum?: StringEnum | null;
    /**
     * 
     * @type {NumberEnum}
     * @memberof EnumPatternObject
     */
    numberEnum?: NumberEnum;
    /**
     * 
     * @type {NumberEnum}
     * @memberof EnumPatternObject
     */
    nullableNumberEnum?: NumberEnum | null;
}



/**
 * Check if a given object implements the EnumPatternObject interface.
 */
export function instanceOfEnumPatternObject(value: object): value is EnumPatternObject {
    return true;
}

export function EnumPatternObjectFromJSON(json: any): EnumPatternObject {
    return EnumPatternObjectFromJSONTyped(json, false);
}

export function EnumPatternObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnumPatternObject {
    if (json == null) {
        return json;
    }
    return {
        
        'stringEnum': json['string-enum'] == null ? undefined : StringEnumFromJSON(json['string-enum']),
        'nullableStringEnum': json['nullable-string-enum'] == null ? undefined : StringEnumFromJSON(json['nullable-string-enum']),
        'numberEnum': json['number-enum'] == null ? undefined : NumberEnumFromJSON(json['number-enum']),
        'nullableNumberEnum': json['nullable-number-enum'] == null ? undefined : NumberEnumFromJSON(json['nullable-number-enum']),
    };
}

export function EnumPatternObjectToJSON(json: any): EnumPatternObject {
    return EnumPatternObjectToJSONTyped(json, false);
}

export function EnumPatternObjectToJSONTyped(value?: EnumPatternObject | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'string-enum': StringEnumToJSON(value['stringEnum']),
        'nullable-string-enum': StringEnumToJSON(value['nullableStringEnum']),
        'number-enum': NumberEnumToJSON(value['numberEnum']),
        'nullable-number-enum': NumberEnumToJSON(value['nullableNumberEnum']),
    };
}

