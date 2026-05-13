package com.omniassist.domain.model

/**
 * Enum representing supported AI providers
 *
 * @property displayName Human-readable provider name
 * @property costPerToken Approximate cost per 1000 tokens (in USD)
 * @property maxTokens Maximum tokens supported per request
 */
enum class AIProvider(
    val displayName: String,
    val costPerToken: Double,
    val maxTokens: Int
) {
    OPENAI_GPT("OpenAI GPT-4", 0.03, 8192),
    OPENAI_GPT_35("OpenAI GPT-3.5", 0.002, 4096),
    GOOGLE_GEMINI("Google Gemini Pro", 0.005, 32000),
    GOOGLE_GEMINI_VISION("Google Gemini Vision", 0.01, 16000),
    ANTHROPIC_CLAUDE("Anthropic Claude 3", 0.015, 200000),
    ANTHROPIC_CLAUDE_INSTANT("Anthropic Claude Instant", 0.008, 100000)
}

/**
 * AI Request model
 *
 * @property provider Which AI provider to use
 * @property prompt User's prompt/query
 * @property systemPrompt Optional system context
 * @property temperature Response randomness (0.0-1.0)
 * @property maxTokens Maximum tokens for response
 * @property includeImages Whether to include image processing
 */
data class AIRequest(
    val provider: AIProvider,
    val prompt: String,
    val systemPrompt: String = "You are a helpful AI assistant",
    val temperature: Float = 0.7f,
    val maxTokens: Int = 1024,
    val includeImages: Boolean = false,
    val imageUrls: List<String> = emptyList()
)

/**
 * AI Response model
 *
 * @property provider Which provider generated response
 * @property content The generated content/response
 * @property tokensUsed Number of tokens consumed
 * @property estimatedCost Estimated cost of this request
 * @property processingTimeMs Time taken to process (milliseconds)
 * @property model Specific model used
 * @property finishReason Why the response ended
 */
data class AIResponse(
    val provider: AIProvider,
    val content: String,
    val tokensUsed: Int,
    val estimatedCost: Double,
    val processingTimeMs: Long,
    val model: String,
    val finishReason: String = "stop"
)

/**
 * Comparison result for multiple AI responses
 *
 * @property responses List of responses from different AIs
 * @property selectedResponse The recommended best response
 * @property selectedIndex Index of selected response
 * @property totalCost Total cost for all requests
 * @property recommendationReason Why this response was selected
 */
data class AIComparisonResult(
    val responses: List<AIResponse>,
    val selectedResponse: AIResponse,
    val selectedIndex: Int,
    val totalCost: Double,
    val recommendationReason: String
)

/**
 * AI Error result
 *
 * @property provider Which provider failed
 * @property errorCode Error code from provider
 * @property errorMessage Human-readable error message
 * @property isRetryable Whether the error can be retried
 * @property timestamp When the error occurred
 */
data class AIError(
    val provider: AIProvider,
    val errorCode: String,
    val errorMessage: String,
    val isRetryable: Boolean = false,
    val timestamp: Long = System.currentTimeMillis()
)

/**
 * AI Model configuration
 *
 * @property name Model identifier
 * @property provider Which provider this belongs to
 * @property maxInputTokens Maximum input token limit
 * @property maxOutputTokens Maximum output token limit
 * @property costPer1kTokens Cost per 1000 tokens
 * @property contextWindow Total context window size
 */
data class AIModel(
    val name: String,
    val provider: AIProvider,
    val maxInputTokens: Int,
    val maxOutputTokens: Int,
    val costPer1kTokens: Double,
    val contextWindow: Int
)
