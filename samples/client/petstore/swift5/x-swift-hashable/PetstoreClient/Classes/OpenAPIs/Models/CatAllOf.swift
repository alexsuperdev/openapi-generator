//
// CatAllOf.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CatAllOf: Codable {

    public var declawed: Bool?

    public init(declawed: Bool? = nil) {
        self.declawed = declawed
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case declawed
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(declawed, forKey: .declawed)
    }
}

