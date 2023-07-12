CREATE VIEW detail_view AS
SELECT d.*, p.total petition, s.name saucer
FROM detail d
JOIN petition p ON d.petition_id = p.id
JOIN saucer s ON d.saucer_id = s.id;
